package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Affiliate: ImageVector
    get() {
        if (_affiliate != null) return _affiliate!!
        _affiliate = tablerFilledIcon(
            name = "Affiliate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.5 3c1.005 0 1.912 .603 2.303 1.529 .391 .926 .188 1.996-.513 2.716-.701 .72-1.766 .95-2.702 .583l-4.556 4.555c.749 1.085 1.081 2.404 .936 3.714l2.624 .787c.765-.903 2.059-1.145 3.1-.581 1.04 .565 1.542 1.782 1.202 2.916-.34 1.134-1.429 1.874-2.609 1.772-1.179-.101-2.126-1.016-2.268-2.191l-2.623-.788c-1.14 2.224-3.637 3.4-6.078 2.862C4.875 20.336 3.104 18.22 3.004 15.722L3 15.5l.004-.221c.079-1.982 1.22-3.767 2.984-4.673L5.2 7.982C4.011 7.839 3.09 6.873 3.006 5.678L3 5.5l.005-.164C3.079 4.202 3.91 3.26 5.026 3.045c1.116-.215 2.237 .349 2.728 1.374 .491 1.025 .229 2.253-.638 2.987l.787 2.625c1.31-.145 2.629 .187 3.714 .936L16.172 6.412c-.094-.239-.15-.492-.167-.748L16 5.5l.005-.164C16.091 4.022 17.183 3 18.5 3Z"),
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
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
