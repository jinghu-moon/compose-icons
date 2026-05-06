package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorFillIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.8 175.94C216.25 166.38 208 139.33 208 104 208 59.817 172.183 24 128 24 83.817 24 48 59.817 48 104c0 35.34-8.26 62.38-13.81 71.94-2.885 4.947-2.906 11.058-.055 16.025 2.851 4.967 8.138 8.031 13.865 8.035h40.81c3.805 18.619 20.186 31.991 39.19 31.991 19.004 0 35.385-13.372 39.19-31.991h40.81c5.725-.008 11.009-3.073 13.858-8.039 2.848-4.966 2.826-11.075-.058-16.021ZM128 216c-10.168-.003-19.231-6.413-22.62-16h45.24c-3.389 9.587-12.452 15.997-22.62 16Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
