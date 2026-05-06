package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTopbuzz: ImageVector
    get() {
        if (_brandTopbuzz != null) return _brandTopbuzz!!
        _brandTopbuzz = tablerOutlineIcon(
            name = "BrandTopbuzz",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.417 8.655C4.281 8.626 4.161 8.545 4.085 8.428 4.009 8.311 3.983 8.169 4.012 8.033L4.998 3.416c.029-.137 .111-.257 .229-.333 .118-.076 .261-.102 .397-.071L20.582 6.174c.285 .06 .467 .339 .406 .622l-.987 4.618c-.029 .137-.111 .256-.228 .332-.117 .076-.26 .102-.397 .072l-4.345-.92c-.198-.04-.315 .024-.353 .197l-2.028 9.49c-.061 .284-.341 .465-.625 .404L7.383 20.007c-.283-.061-.465-.338-.406-.622L9.005 9.892c.037-.17-.031-.274-.204-.31L4.417 8.655"),
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
        return _brandTopbuzz!!
    }

private var _brandTopbuzz: ImageVector? = null
