package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pill: ImageVector
    get() {
        if (_pill != null) return _pill!!
        _pill = phosphorLightIcon(
            name = "Pill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M215 41C194.976 20.988 162.524 20.988 142.5 41L41 142.5c-20.02 20.018-20.023 52.475-.005 72.495 20.018 20.02 52.475 20.023 72.495 .005L215 113.5C234.996 93.469 234.996 61.031 215 41ZM105 206.5c-15.415 14.792-39.829 14.542-54.938-.562C34.952 190.834 34.694 166.421 49.48 151L96 104.49 151.52 160ZM206.52 105 160 151.51 104.48 96 151 49.5c15.415-14.792 39.829-14.542 54.938 .562 15.11 15.104 15.368 39.518 .582 54.938ZM188.26 83.76c2.34 2.343 2.34 6.137 0 8.48l-24 24c-2.347 2.312-6.12 2.299-8.451-.029-2.331-2.328-2.349-6.101-.039-8.451l24-24c1.125-1.127 2.653-1.76 4.245-1.76 1.592 0 3.12 .633 4.245 1.76Z"),
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
        return _pill!!
    }

private var _pill: ImageVector? = null
