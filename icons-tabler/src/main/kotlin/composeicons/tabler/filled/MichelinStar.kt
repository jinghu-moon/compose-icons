package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerFilledIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.81 2c2.018 0 3.478 1.232 3.874 3.129l.016 .089 .172-.057c.34-.104 .684-.16 1.055-.175l.227-.005c2.09 0 3.925 1.93 3.925 4.094 0 1.095-.51 2.087-1.364 2.835l-.118 .098 .06 .048c.88 .737 1.36 1.605 1.416 2.656l.006 .213c0 2.24-1.739 4.094-3.925 4.094-.445 0-.923-.084-1.374-.233l-.043 .193c-.395 1.736-1.806 2.933-3.662 3.016L11.867 22C9.849 22 8.39 20.768 7.994 18.87l-.03-.161-.011 .006c-.405 .147-.83 .229-1.26 .243l-.226 .005c-2.09 0-3.925-1.93-3.925-4.094 0-1.096 .51-2.087 1.378-2.84l.073-.062-.03-.023C3.083 11.207 2.604 10.339 2.548 9.288L2.542 9.075C2.542 6.836 4.282 4.981 6.467 4.981c.44 0 .92 .098 1.391 .27l.036 .013 .008-.048C8.233 3.376 9.678 2.091 11.602 2.005Z"),
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
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
