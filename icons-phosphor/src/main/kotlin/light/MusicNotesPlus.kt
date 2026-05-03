package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNotesPlus: ImageVector
    get() {
        if (_musicNotesPlus != null) return _musicNotesPlus!!
        _musicNotesPlus = phosphorLightIcon(
            name = "MusicNotesPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 48.000 C 230.000 51.314 227.314 54.000 224.000 54.000 L 206.000 54.000 L 206.000 72.000 C 206.000 75.314 203.314 78.000 200.000 78.000 C 196.686 78.000 194.000 75.314 194.000 72.000 L 194.000 54.000 L 176.000 54.000 C 172.686 54.000 170.000 51.314 170.000 48.000 C 170.000 44.686 172.686 42.000 176.000 42.000 L 194.000 42.000 L 194.000 24.000 C 194.000 20.686 196.686 18.000 200.000 18.000 C 203.314 18.000 206.000 20.686 206.000 24.000 L 206.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 ZM 214.000 112.000 L 214.000 164.000 C 214.029 179.996 202.921 193.857 187.303 197.315 C 171.685 200.773 155.765 192.897 149.038 178.384 C 142.311 163.871 146.590 146.632 159.324 136.949 C 172.057 127.266 189.812 127.749 202.000 138.110 L 202.000 112.000 C 202.000 108.686 204.686 106.000 208.000 106.000 C 211.314 106.000 214.000 108.686 214.000 112.000 ZM 202.000 164.000 C 202.000 151.850 192.150 142.000 180.000 142.000 C 167.850 142.000 158.000 151.850 158.000 164.000 C 158.000 176.150 167.850 186.000 180.000 186.000 C 192.150 186.000 202.000 176.150 202.000 164.000 ZM 86.000 108.680 L 86.000 196.000 C 86.029 211.996 74.921 225.857 59.303 229.315 C 43.685 232.773 27.765 224.897 21.038 210.384 C 14.311 195.871 18.590 178.632 31.324 168.949 C 44.057 159.266 61.812 159.749 74.000 170.110 L 74.000 56.000 C 74.000 53.249 75.871 50.850 78.540 50.180 L 134.540 36.180 C 137.754 35.374 141.014 37.326 141.820 40.540 C 142.626 43.754 140.674 47.014 137.460 47.820 L 86.000 60.680 L 86.000 96.320 L 158.540 78.180 C 161.754 77.374 165.014 79.326 165.820 82.540 C 166.626 85.754 164.674 89.014 161.460 89.820 ZM 74.000 196.000 C 74.000 183.850 64.150 174.000 52.000 174.000 C 39.850 174.000 30.000 183.850 30.000 196.000 C 30.000 208.150 39.850 218.000 52.000 218.000 C 64.150 218.000 74.000 208.150 74.000 196.000 Z"),
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
        return _musicNotesPlus!!
    }

private var _musicNotesPlus: ImageVector? = null
