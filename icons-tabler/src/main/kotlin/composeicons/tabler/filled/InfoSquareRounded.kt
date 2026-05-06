package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.InfoSquareRounded: ImageVector
    get() {
        if (_infoSquareRounded != null) return _infoSquareRounded!!
        _infoSquareRounded = tablerFilledIcon(
            name = "InfoSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.642 .005 .616 .017 .299 .013 .579 .034 .553 .046c4.687 .455 6.65 2.333 7.166 6.906l.03 .29 .046 .553 .041 .727 .006 .15 .017 .617L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.455 4.687-2.333 6.65-6.906 7.166l-.29 .03-.553 .046-.727 .041-.15 .006-.617 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.624 21.43 2.661 19.552 2.145 14.979l-.03-.29-.046-.553-.041-.727-.006-.15-.017-.617-.004-.318v-.648l.004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.57 4.624 4.448 2.661 9.021 2.145l.29-.03 .553-.046 .727-.041 .15-.006 .617-.017C11.568 2.002 11.782 2 12 2ZM12 11h-1l-.117 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L11 13v3l.007 .117c.054 .459 .417 .822 .876 .876L12 17h1l.117-.007c.459-.054 .822-.417 .876-.876L14 16l-.007-.117c-.049-.418-.354-.761-.764-.857l-.112-.02L13 15v-3l-.007-.117c-.054-.459-.417-.822-.876-.876L12 11ZM12.01 8l-.127 .007c-.503 .06-.882 .486-.882 .993 0 .507 .379 .933 .882 .993L12 10l.127-.007c.503-.06 .882-.486 .882-.993 0-.507-.379-.933-.882-.993L12.01 8Z"),
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
        return _infoSquareRounded!!
    }

private var _infoSquareRounded: ImageVector? = null
