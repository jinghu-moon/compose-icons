package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lightning: ImageVector
    get() {
        if (_lightning != null) return _lightning!!
        _lightning = phosphorLightIcon(
            name = "Lightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.84 118.63c-.456-1.95-1.855-3.545-3.73-4.25L150.88 92.17l15-75c.526-2.63-.758-5.29-3.144-6.514-2.386-1.225-5.296-.717-7.126 1.244l-112 120c-1.366 1.465-1.911 3.514-1.453 5.464 .458 1.95 1.858 3.542 3.733 4.246l59.23 22.21-15 75c-.529 2.631 .753 5.293 3.14 6.52 .849 .432 1.788 .658 2.74 .66 1.665 0 3.255-.692 4.39-1.91l112-120c1.363-1.464 1.907-3.512 1.45-5.46ZM106 220.46l11.85-59.28c.581-2.884-1.016-5.764-3.77-6.8L58.48 133.53l91.46-98L138.12 94.82c-.581 2.884 1.016 5.764 3.77 6.8l55.6 20.85Z"),
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
        return _lightning!!
    }

private var _lightning: ImageVector? = null
