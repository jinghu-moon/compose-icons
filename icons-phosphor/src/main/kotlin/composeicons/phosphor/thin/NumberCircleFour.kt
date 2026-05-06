package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorThinIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM160 148h-12v-68c.003-1.711-1.082-3.235-2.7-3.791-1.618-.556-3.411-.021-4.46 1.331l-56 72c-.941 1.206-1.111 2.843-.439 4.218 .672 1.374 2.069 2.245 3.599 2.242h52v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h12c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM140 148h-43.82L140 91.66Z"),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
