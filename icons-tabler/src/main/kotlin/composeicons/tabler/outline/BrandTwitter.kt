package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerOutlineIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 4.01C21 4.5 20.02 4.699 19 5 17.879 3.735 16.217 3.665 14.62 4.263 13.023 4.861 11.977 6.323 12 8v1C8.755 9.083 5.865 7.605 4 5 4 5-.182 12.433 8 16 6.128 17.247 4.261 18.088 2 18c3.308 1.803 6.913 2.423 10.034 1.517 3.58-1.04 6.522-3.723 7.651-7.742 .337-1.222 .504-2.485 .497-3.753 0-.249 1.51-2.772 1.818-4.013v.001"),
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
