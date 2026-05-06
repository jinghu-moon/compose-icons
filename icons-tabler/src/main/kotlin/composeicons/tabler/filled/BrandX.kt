package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandX: ImageVector
    get() {
        if (_brandX != null) return _brandX!!
        _brandX = tablerFilledIcon(
            name = "BrandX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.267 3c.277 0 .541 .115 .73 .317l.076 .092 4.274 5.828L19.293 3.293c.373-.372 .972-.39 1.367-.042 .395 .349 .452 .945 .13 1.362l-.083 .094-6.163 6.162 6.262 8.54c.211 .288 .252 .667 .109 .994-.144 .327-.451 .552-.806 .591L20 21h-4.267c-.277-0-.541-.115-.73-.317l-.076-.092L10.651 14.762 4.707 20.707c-.373 .372-.972 .39-1.367 .042-.395-.349-.452-.945-.13-1.362l.083-.094L9.454 13.13 3.194 4.591C2.983 4.303 2.942 3.924 3.085 3.597c.144-.327 .451-.552 .806-.591L4 3h4.267Z"),
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
        return _brandX!!
    }

private var _brandX: ImageVector? = null
