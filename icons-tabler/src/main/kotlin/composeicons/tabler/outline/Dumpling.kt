package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerOutlineIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.532 5.532c.669-.671 1.657-.911 2.56-.623C8.341 3.925 9.154 3.185 10.157 3.028c1.003-.156 2.002 .302 2.539 1.164q.146-.24 .356-.45c.704-.705 1.757-.931 2.688-.577 .932 .353 1.57 1.22 1.63 2.214 .962-.441 2.096-.237 2.844 .511l.358 .358c1.384 1.385-.7 5.713-4.655 9.669-3.956 3.955-8.284 6.04-9.669 4.655l-.358-.358-.114-.122c-.658-.75-.814-1.817-.398-2.724C4.279 17.301 3.349 16.531 3.079 15.463c-.271-1.067 .179-2.187 1.113-2.77C3.331 12.156 2.874 11.157 3.03 10.154 3.186 9.152 3.926 8.339 4.91 8.09 4.622 7.188 4.862 6.201 5.532 5.532"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
