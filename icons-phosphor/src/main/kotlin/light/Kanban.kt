package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Kanban: ImageVector
    get() {
        if (_kanban != null) return _kanban!!
        _kanban = phosphorLightIcon(
            name = "Kanban",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 216.000 50.000 L 40.000 50.000 C 36.686 50.000 34.000 52.686 34.000 56.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 88.000 222.000 C 95.732 222.000 102.000 215.732 102.000 208.000 L 102.000 158.000 L 154.000 158.000 L 154.000 176.000 C 154.000 183.732 160.268 190.000 168.000 190.000 L 208.000 190.000 C 215.732 190.000 222.000 183.732 222.000 176.000 L 222.000 56.000 C 222.000 52.686 219.314 50.000 216.000 50.000 ZM 210.000 114.000 L 166.000 114.000 L 166.000 62.000 L 210.000 62.000 ZM 90.000 62.000 L 90.000 114.000 L 46.000 114.000 L 46.000 62.000 ZM 90.000 208.000 C 90.000 209.105 89.105 210.000 88.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 126.000 L 90.000 126.000 ZM 102.000 146.000 L 102.000 62.000 L 154.000 62.000 L 154.000 146.000 ZM 208.000 178.000 L 168.000 178.000 C 166.895 178.000 166.000 177.105 166.000 176.000 L 166.000 126.000 L 210.000 126.000 L 210.000 176.000 C 210.000 177.105 209.105 178.000 208.000 178.000 Z"),
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
        return _kanban!!
    }

private var _kanban: ImageVector? = null
