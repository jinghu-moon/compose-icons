package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCake: ImageVector
    get() {
        if (_brandCake != null) return _brandCake!!
        _brandCake = tablerOutlineIcon(
            name = "BrandCake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.84 12c0 2.05 .985 3.225-.04 5-1.026 1.775-2.537 1.51-4.314 2.534C14.71 20.56 14.184 22 12.133 22 10.082 22 9.557 20.559 7.78 19.534 6.004 18.51 4.492 18.775 3.466 17 2.441 15.225 3.426 14.05 3.426 12c0-2.05-.985-3.225 .04-5C4.492 5.225 6.003 5.49 7.78 4.466 9.556 3.44 10.082 2 12.133 2c2.051 0 2.577 1.441 4.353 2.466 1.776 1.024 3.288 .759 4.313 2.534 1.026 1.775 .04 2.95 .04 5h.001"),
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
        return _brandCake!!
    }

private var _brandCake: ImageVector? = null
