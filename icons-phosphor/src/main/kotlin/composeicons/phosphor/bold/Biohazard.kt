package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = phosphorBoldIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M188.26 100.55c-.37-.71-.76-1.42-1.16-2.11C199.821 67.78 186.99 32.483 157.55 17.15c-5.876-3.065-13.125-.786-16.19 5.09-3.065 5.876-.786 13.125 5.09 16.19 13.256 6.868 21.57 20.56 21.55 35.49 0 1-.05 2-.13 3-23.77-17.286-55.97-17.286-79.74 0-.08-1-.13-2-.13-3C87.978 58.988 96.292 45.291 109.55 38.42c3.88-1.937 6.413-5.817 6.625-10.149 .212-4.332-1.929-8.441-5.601-10.748-3.672-2.307-8.303-2.454-12.114-.383C69.001 32.467 56.159 67.78 68.89 98.45c-.4 .7-.78 1.39-1.15 2.1C35.879 104.732 12.043 131.866 12 164c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .003-15.973 9.509-30.413 24.18-36.73C60.07 128.83 60 130.41 60 132c.031 27.357 16.426 52.042 41.63 62.68-13.386 11.171-32.466 12.385-47.16 3-3.611-2.384-8.226-2.639-12.078-.668-3.852 1.971-6.344 5.864-6.523 10.187-.178 4.323 1.985 8.408 5.661 10.69 28.663 18.339 66.667 11.021 86.47-16.65 19.791 27.685 57.797 35.021 86.47 16.69 3.676-2.282 5.839-6.367 5.661-10.69-.178-4.323-2.671-8.216-6.523-10.187-3.852-1.971-8.467-1.716-12.078 .668-14.694 9.385-33.774 8.171-47.16-3C179.587 184.076 195.985 159.372 196 132c0-1.59-.07-3.17-.18-4.73 14.671 6.317 24.177 20.757 24.18 36.73 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12-.043-32.134-23.879-59.268-55.74-63.45ZM128 88c11.252-.004 22.075 4.317 30.23 12.07-7.585 8.79-18.62 13.843-30.23 13.843-11.61 0-22.645-5.053-30.23-13.843C105.923 92.314 116.747 87.992 128 88ZM84 132c.001-2.365 .192-4.726 .57-7.06 10.599 2.324 19.799 8.855 25.49 18.094 5.691 9.239 7.383 20.394 4.69 30.906C96.467 168.139 84.033 151.181 84 132ZM141.25 174c-2.693-10.512-1.001-21.666 4.69-30.906 5.691-9.239 14.891-15.77 25.49-18.094 3.496 21.56-9.353 42.421-30.18 49Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
