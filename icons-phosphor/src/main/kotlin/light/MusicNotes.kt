package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorLightIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 211.690 19.270 C 210.233 18.133 208.333 17.731 206.540 18.180 L 78.540 50.180 C 75.871 50.850 74.000 53.249 74.000 56.000 L 74.000 170.110 C 61.829 159.781 44.111 159.310 31.409 168.977 C 18.706 178.645 14.440 195.848 21.152 210.331 C 27.865 224.814 43.750 232.677 59.337 229.232 C 74.924 225.787 86.015 211.963 86.000 196.000 L 86.000 108.680 L 202.000 79.680 L 202.000 138.110 C 189.829 127.781 172.111 127.310 159.409 136.977 C 146.706 146.645 142.440 163.848 149.152 178.331 C 155.865 192.814 171.750 200.677 187.337 197.232 C 202.924 193.787 214.015 179.963 214.000 164.000 L 214.000 24.000 C 214.000 22.152 213.147 20.407 211.690 19.270 ZM 52.000 218.000 C 39.850 218.000 30.000 208.150 30.000 196.000 C 30.000 183.850 39.850 174.000 52.000 174.000 C 64.150 174.000 74.000 183.850 74.000 196.000 C 74.000 208.150 64.150 218.000 52.000 218.000 ZM 86.000 96.320 L 86.000 60.680 L 202.000 31.680 L 202.000 67.320 ZM 180.000 186.000 C 167.850 186.000 158.000 176.150 158.000 164.000 C 158.000 151.850 167.850 142.000 180.000 142.000 C 192.150 142.000 202.000 151.850 202.000 164.000 C 202.000 176.150 192.150 186.000 180.000 186.000 Z"),
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
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
