package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerOutlineIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 5c1.685 .002 3.228 .944 3.998 2.443 .77 1.499 .639 3.302-.341 4.673-.98 1.371-2.643 2.08-4.31 1.837l-4.347 3.009v.038c.003 1.59-1.236 2.907-2.824 3h-.176C7.074 20 5.844 18.996 5.56 17.598L3 16.5v-3.5l3.51 1.755c.771-.687 1.843-.927 2.834-.635l2.727-3.818c-.238-1.313 .119-2.663 .974-3.687C13.901 5.591 15.166 5 16.5 5"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M15.5 9.5c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
