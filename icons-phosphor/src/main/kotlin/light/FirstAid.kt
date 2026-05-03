package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorLightIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 90.000 L 166.000 90.000 L 166.000 40.000 C 166.000 32.268 159.732 26.000 152.000 26.000 L 104.000 26.000 C 96.268 26.000 90.000 32.268 90.000 40.000 L 90.000 90.000 L 40.000 90.000 C 32.268 90.000 26.000 96.268 26.000 104.000 L 26.000 152.000 C 26.000 159.732 32.268 166.000 40.000 166.000 L 90.000 166.000 L 90.000 216.000 C 90.000 223.732 96.268 230.000 104.000 230.000 L 152.000 230.000 C 159.732 230.000 166.000 223.732 166.000 216.000 L 166.000 166.000 L 216.000 166.000 C 223.732 166.000 230.000 159.732 230.000 152.000 L 230.000 104.000 C 230.000 96.268 223.732 90.000 216.000 90.000 ZM 218.000 152.000 C 218.000 153.105 217.105 154.000 216.000 154.000 L 160.000 154.000 C 156.686 154.000 154.000 156.686 154.000 160.000 L 154.000 216.000 C 154.000 217.105 153.105 218.000 152.000 218.000 L 104.000 218.000 C 102.895 218.000 102.000 217.105 102.000 216.000 L 102.000 160.000 C 102.000 156.686 99.314 154.000 96.000 154.000 L 40.000 154.000 C 38.895 154.000 38.000 153.105 38.000 152.000 L 38.000 104.000 C 38.000 102.895 38.895 102.000 40.000 102.000 L 96.000 102.000 C 99.314 102.000 102.000 99.314 102.000 96.000 L 102.000 40.000 C 102.000 38.895 102.895 38.000 104.000 38.000 L 152.000 38.000 C 153.105 38.000 154.000 38.895 154.000 40.000 L 154.000 96.000 C 154.000 99.314 156.686 102.000 160.000 102.000 L 216.000 102.000 C 217.105 102.000 218.000 102.895 218.000 104.000 Z"),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
