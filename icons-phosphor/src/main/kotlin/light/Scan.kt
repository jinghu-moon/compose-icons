package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Scan: ImageVector
    get() {
        if (_scan != null) return _scan!!
        _scan = phosphorLightIcon(
            name = "Scan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 222.000 40.000 L 222.000 80.000 C 222.000 83.314 219.314 86.000 216.000 86.000 C 212.686 86.000 210.000 83.314 210.000 80.000 L 210.000 46.000 L 176.000 46.000 C 172.686 46.000 170.000 43.314 170.000 40.000 C 170.000 36.686 172.686 34.000 176.000 34.000 L 216.000 34.000 C 219.314 34.000 222.000 36.686 222.000 40.000 ZM 80.000 210.000 L 46.000 210.000 L 46.000 176.000 C 46.000 172.686 43.314 170.000 40.000 170.000 C 36.686 170.000 34.000 172.686 34.000 176.000 L 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 80.000 222.000 C 83.314 222.000 86.000 219.314 86.000 216.000 C 86.000 212.686 83.314 210.000 80.000 210.000 ZM 216.000 170.000 C 212.686 170.000 210.000 172.686 210.000 176.000 L 210.000 210.000 L 176.000 210.000 C 172.686 210.000 170.000 212.686 170.000 216.000 C 170.000 219.314 172.686 222.000 176.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 L 222.000 176.000 C 222.000 172.686 219.314 170.000 216.000 170.000 ZM 40.000 86.000 C 43.314 86.000 46.000 83.314 46.000 80.000 L 46.000 46.000 L 80.000 46.000 C 83.314 46.000 86.000 43.314 86.000 40.000 C 86.000 36.686 83.314 34.000 80.000 34.000 L 40.000 34.000 C 36.686 34.000 34.000 36.686 34.000 40.000 L 34.000 80.000 C 34.000 83.314 36.686 86.000 40.000 86.000 ZM 80.000 74.000 L 176.000 74.000 C 179.314 74.000 182.000 76.686 182.000 80.000 L 182.000 176.000 C 182.000 179.314 179.314 182.000 176.000 182.000 L 80.000 182.000 C 76.686 182.000 74.000 179.314 74.000 176.000 L 74.000 80.000 C 74.000 76.686 76.686 74.000 80.000 74.000 ZM 86.000 170.000 L 170.000 170.000 L 170.000 86.000 L 86.000 86.000 Z"),
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
        return _scan!!
    }

private var _scan: ImageVector? = null
