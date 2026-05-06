package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = radixIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 11.607c.483 0 .875 .392 .875 .875 0 .483-.392 .875-.875 .875-.483 0-.875-.392-.875-.875 0-.483 .392-.875 .875-.875ZM7.5 .775c1.719 0 3.575 1.353 3.575 3.325 0 1.653-.943 2.474-1.693 3.14C8.63 7.907 8.075 8.416 8.075 9.501c-0 .317-.258 .574-.575 .574-.317 0-.575-.257-.575-.574 0-1.642 .946-2.458 1.693-3.121C9.368 5.715 9.925 5.199 9.925 4.1 9.925 2.911 8.743 1.926 7.5 1.925c-1.243 0-2.425 .986-2.425 2.175-0 .317-.258 .575-.575 .575-.317 0-.575-.258-.575-.575C3.925 2.128 5.782 .775 7.5 .775Z"),
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
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
