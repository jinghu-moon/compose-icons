package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorLightIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 140c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM126 92c0-5.523-4.477-10-10-10-5.523 0-10 4.477-10 10 0 5.523 4.477 10 10 10 5.523 0 10-4.477 10-10ZM199.62 55.37C160.365 16.859 97.649 16.398 57.833 54.329 18.017 92.259 15.437 154.925 52 196c1.414 1.655 3.613 2.415 5.746 1.985 2.134-.43 3.867-1.981 4.531-4.054 .663-2.073 .151-4.343-1.337-5.931C37.512 161.698 31.561 124.154 45.707 91.896 59.853 59.638 91.501 38.583 126.72 38h1.28c35.489 .005 67.662 20.865 82.149 53.263 14.486 32.398 8.581 70.285-15.079 96.737-2.209 2.471-1.996 6.266 .475 8.475 2.471 2.209 6.266 1.996 8.475-.475C240.29 155.449 238.35 93.569 199.61 55.37ZM152 170h-16C113.35 170 86 151.27 86 128c.003-2.345 .197-4.686 .58-7 .402-2.133-.379-4.317-2.043-5.711-1.664-1.394-3.951-1.781-5.98-1.011-2.03 .769-3.485 2.575-3.807 4.722-.501 2.974-.752 5.984-.75 9 0 14.26 7.2 28 20.27 38.6 12 9.79 27.26 15.4 41.73 15.4h16c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10h-56c-12.15 0-22 9.85-22 22 0 12.15 9.85 22 22 22 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10h56c12.15 0 22-9.85 22-22 0-12.15-9.85-22-22-22Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
