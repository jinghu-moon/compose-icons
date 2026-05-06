package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CameraSlash: ImageVector
    get() {
        if (_cameraSlash != null) return _cameraSlash!!
        _cameraSlash = phosphorRegularIcon(
            name = "CameraSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L51.73 56h-3.73C34.745 56 24 66.745 24 80v112c0 13.255 10.745 24 24 24h149.19l4.89 5.38c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM105.58 115.23l37 40.69c-4.387 2.687-9.435 4.1-14.58 4.08-10.598-.001-20.288-5.986-25.034-15.462-4.746-9.477-3.734-20.82 2.614-29.308ZM48 200c-4.418 0-8-3.582-8-8v-112c0-4.418 3.582-8 8-8h18.28l28.41 31.26c-11.239 13.029-13.852 31.415-6.688 47.06C95.166 165.964 110.793 175.997 128 176c9.114-.02 18-2.856 25.44-8.12L182.64 200ZM232 80v106c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-106c0-4.418-3.582-8-8-8h-32c-2.672-.002-5.167-1.337-6.65-3.56L155.71 48h-55.47c-2.679 3.323-7.495 3.957-10.943 1.441C85.849 46.925 84.983 42.145 87.33 38.58l2-3C90.812 33.344 93.317 31.999 96 32h64c2.676-.002 5.175 1.334 6.66 3.56L180.28 56h27.72c13.255 0 24 10.745 24 24Z"),
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
        return _cameraSlash!!
    }

private var _cameraSlash: ImageVector? = null
