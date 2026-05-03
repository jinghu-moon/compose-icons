package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorLightIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 210.000 L 166.000 210.000 L 166.000 182.000 L 172.000 182.000 C 208.433 181.956 237.956 152.433 238.000 116.000 C 238.000 101.641 226.359 90.000 212.000 90.000 C 197.641 90.000 186.000 101.641 186.000 116.000 C 186.000 123.732 179.732 130.000 172.000 130.000 L 166.000 130.000 L 166.000 56.000 C 166.000 35.013 148.987 18.000 128.000 18.000 C 107.013 18.000 90.000 35.013 90.000 56.000 L 90.000 90.000 L 84.000 90.000 C 76.268 90.000 70.000 83.732 70.000 76.000 C 70.000 61.641 58.359 50.000 44.000 50.000 C 29.641 50.000 18.000 61.641 18.000 76.000 C 18.044 112.433 47.567 141.956 84.000 142.000 L 90.000 142.000 L 90.000 210.000 L 40.000 210.000 C 36.686 210.000 34.000 212.686 34.000 216.000 C 34.000 219.314 36.686 222.000 40.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 C 222.000 212.686 219.314 210.000 216.000 210.000 ZM 96.000 130.000 L 84.000 130.000 C 54.190 129.967 30.033 105.810 30.000 76.000 C 30.000 68.268 36.268 62.000 44.000 62.000 C 51.732 62.000 58.000 68.268 58.000 76.000 C 58.000 90.359 69.641 102.000 84.000 102.000 L 96.000 102.000 C 99.314 102.000 102.000 99.314 102.000 96.000 L 102.000 56.000 C 102.000 41.641 113.641 30.000 128.000 30.000 C 142.359 30.000 154.000 41.641 154.000 56.000 L 154.000 136.000 C 154.000 139.314 156.686 142.000 160.000 142.000 L 172.000 142.000 C 186.359 142.000 198.000 130.359 198.000 116.000 C 198.000 108.268 204.268 102.000 212.000 102.000 C 219.732 102.000 226.000 108.268 226.000 116.000 C 225.967 145.810 201.810 169.967 172.000 170.000 L 160.000 170.000 C 156.686 170.000 154.000 172.686 154.000 176.000 L 154.000 210.000 L 102.000 210.000 L 102.000 136.000 C 102.000 132.686 99.314 130.000 96.000 130.000 Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
