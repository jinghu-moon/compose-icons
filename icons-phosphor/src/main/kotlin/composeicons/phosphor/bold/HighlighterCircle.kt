package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorBoldIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204.37 51.59C167.941 15.159 110.851 9.531 68.01 38.149 25.169 66.766 8.507 121.66 28.212 169.263c19.705 47.603 70.291 74.659 120.824 64.624C199.569 223.852 235.979 179.52 236 128 236 99.345 224.623 71.862 204.37 51.59ZM140 136h-24v-24.61l24-12ZM100 207.25v-47.25h56v47.25c-18.127 6.347-37.873 6.347-56 0ZM187.4 187.41c-2.337 2.326-4.808 4.513-7.4 6.55v-37.96c.002-9.505-6.687-17.699-16-19.6v-56.4c-0-4.159-2.155-8.022-5.693-10.208-3.539-2.186-7.957-2.384-11.677-.522l-48 24C94.567 95.303 92.001 99.457 92 104v32.41C82.69 138.31 76.003 146.498 76 156v38c-2.592-2.037-5.063-4.224-7.4-6.55C35.798 154.645 35.8 101.461 68.604 68.658c32.804-32.803 85.988-32.803 118.792 0 32.804 32.803 32.806 85.987 .004 118.792Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
