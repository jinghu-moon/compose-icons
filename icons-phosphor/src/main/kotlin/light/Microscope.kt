package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorLightIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 210.000 L 199.530 210.000 C 214.062 194.189 222.087 173.474 222.000 152.000 C 221.940 106.859 187.028 69.428 142.000 66.230 L 142.000 32.000 C 142.000 24.268 135.732 18.000 128.000 18.000 L 80.000 18.000 C 72.268 18.000 66.000 24.268 66.000 32.000 L 66.000 136.000 C 66.000 143.732 72.268 150.000 80.000 150.000 L 128.000 150.000 C 135.732 150.000 142.000 143.732 142.000 136.000 L 142.000 78.260 C 172.290 80.715 198.000 101.440 206.829 130.519 C 215.658 159.597 205.811 191.118 182.000 210.000 L 32.000 210.000 C 28.686 210.000 26.000 212.686 26.000 216.000 C 26.000 219.314 28.686 222.000 32.000 222.000 L 224.000 222.000 C 227.314 222.000 230.000 219.314 230.000 216.000 C 230.000 212.686 227.314 210.000 224.000 210.000 ZM 130.000 136.000 C 130.000 137.105 129.105 138.000 128.000 138.000 L 80.000 138.000 C 78.895 138.000 78.000 137.105 78.000 136.000 L 78.000 32.000 C 78.000 30.895 78.895 30.000 80.000 30.000 L 128.000 30.000 C 129.105 30.000 130.000 30.895 130.000 32.000 ZM 72.000 182.000 C 68.686 182.000 66.000 179.314 66.000 176.000 C 66.000 172.686 68.686 170.000 72.000 170.000 L 136.000 170.000 C 139.314 170.000 142.000 172.686 142.000 176.000 C 142.000 179.314 139.314 182.000 136.000 182.000 Z"),
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
        return _microscope!!
    }

private var _microscope: ImageVector? = null
