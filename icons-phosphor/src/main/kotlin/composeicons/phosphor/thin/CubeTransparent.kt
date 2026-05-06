package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CubeTransparent: ImageVector
    get() {
        if (_cubeTransparent != null) return _cubeTransparent!!
        _cubeTransparent = phosphorThinIcon(
            name = "CubeTransparent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.92 95.22c-.023-.113-.056-.223-.1-.33-.034-.143-.078-.283-.13-.42-.053-.128-.117-.252-.19-.37-.06-.11-.11-.22-.17-.32-.145-.217-.312-.419-.5-.6h0l-56-56h0c-.101-.1-.212-.19-.33-.27-.705-.58-1.587-.901-2.5-.91h-120c-2.209 0-4 1.791-4 4v120c.006 .912 .324 1.794 .9 2.5 .08 .118 .17 .229 .27 .33l56 56c.751 .75 1.769 1.171 2.83 1.17h120c2.209 0 4-1.791 4-4v-120c-.002-.262-.029-.523-.08-.78ZM164 49.66 206.34 92h-42.34ZM92 206.34 49.66 164h42.34ZM92 156h-48v-106.34L92 97.66ZM49.66 44h106.34v48h-58.34ZM156 100v56h-56v-56ZM100 212v-48h58.34l48 48ZM212 206.34l-48-48v-58.34h48Z"),
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
        return _cubeTransparent!!
    }

private var _cubeTransparent: ImageVector? = null
