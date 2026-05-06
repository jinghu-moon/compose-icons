package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GlobeX: ImageVector
    get() {
        if (_globeX != null) return _globeX!!
        _globeX = phosphorBoldIcon(
            name = "GlobeX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 5.095-.003 9.632-3.223 11.318-8.031 1.685-4.808 .151-10.156-3.828-13.339h0c-.25-.2-17.55-14.39-27.9-42.63h20.41c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-26.52c-1.973-13.26-1.973-26.74 0-40h53c1.006 6.619 1.515 13.305 1.52 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 .004-6.686-.413-13.366-1.25-20h30.82c1.614 6.544 2.43 13.26 2.43 20 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C235.934 68.381 187.619 20.066 128 20ZM97.79 49.64C91.107 60.347 85.893 71.904 82.29 84h-25.81C66.143 68.355 80.647 56.291 97.79 49.64ZM97.79 206.36C80.647 199.709 66.143 187.645 56.48 172h25.81c3.603 12.096 8.817 23.653 15.5 34.36ZM77.25 148h-30.82c-3.24-13.137-3.24-26.863 0-40h30.82c-1.667 13.281-1.667 26.719 0 40ZM107.59 84c2.639-7.237 5.989-14.194 10-20.77C120.665 58.21 124.147 53.451 128 49c8.846 10.346 15.753 22.202 20.39 35ZM173.71 84C170.107 71.904 164.893 60.347 158.21 49.64c17.143 6.651 31.647 18.715 41.31 34.36ZM224.49 176.49 209 192l15.52 15.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L192 209l-15.51 15.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L175 192 159.48 176.49c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L192 175l15.51-15.52c4.694-4.694 12.306-4.694 17 0 4.694 4.694 4.694 12.306 0 17Z"),
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
        return _globeX!!
    }

private var _globeX: ImageVector? = null
