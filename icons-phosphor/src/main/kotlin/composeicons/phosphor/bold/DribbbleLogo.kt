package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) return _dribbbleLogo!!
        _dribbbleLogo = phosphorBoldIcon(
            name = "DribbbleLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM211.13 116c-1 0-2.08 0-3.12 0-13.95 .008-27.848 1.707-41.39 5.06C163.684 112.913 160.133 105 156 97.39c12.049-7.653 23.1-16.772 32.9-27.15 11.977 12.578 19.746 28.57 22.23 45.76ZM170 55.3c-8.113 8.325-17.175 15.668-27 21.88C134.197 65.352 123.921 54.696 112.42 45.47c19.751-3.761 40.196-.27 57.58 9.83ZM85.54 55.57c13.685 8.918 25.813 20.022 35.9 32.87C103.257 96.09 83.726 100.02 64 100c-5 0-10-.26-14.94-.75C55.8 80.911 68.688 65.475 85.53 55.57ZM44 128c0-1.73 .07-3.44 .17-5.14 6.583 .755 13.204 1.135 19.83 1.14 24.427 .02 48.577-5.168 70.84-15.22 3.455 6.321 6.436 12.889 8.92 19.65-7.409 2.973-14.6 6.461-21.52 10.44-21.105 12.185-39.398 28.693-53.68 48.44C52.823 171.586 43.986 150.247 44 128ZM87.77 201.72c12.33-17.155 28.167-31.492 46.46-42.06 5.168-2.968 10.511-5.62 16-7.94 1.774 9.228 2.668 18.603 2.67 28 .008 9.852-.964 19.68-2.9 29.34-20.909 5.689-43.209 3.058-62.22-7.34ZM176.06 196.83c.56-5.68 .86-11.4 .86-17.14-.007-11.943-1.253-23.854-3.72-35.54C184.596 141.401 196.277 140.008 208 140c1 0 2.07 0 3.11 0-3.337 22.97-16.023 43.537-35.05 56.83Z"),
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
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
