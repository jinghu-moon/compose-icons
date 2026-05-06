package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorRegularIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211 103.43l-70.13 28 49.47 63.61c1.803 2.252 2.253 5.301 1.179 7.978-1.074 2.677-3.507 4.569-6.367 4.95-2.86 .381-5.703-.806-7.442-3.109L128 141 78.32 204.91c-2.733 3.415-7.703 4.002-11.156 1.317-3.453-2.685-4.11-7.646-1.474-11.137l49.47-63.61L45 103.43C40.897 101.773 38.913 97.103 40.57 93 42.227 88.897 46.897 86.913 51 88.57l69 27.61v-76.18c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v76.18L205 88.57c4.103-1.657 8.773 .327 10.43 4.43 1.657 4.103-.327 8.773-4.43 10.43Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
