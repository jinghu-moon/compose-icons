package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HelpSquareRounded: ImageVector
    get() {
        if (_helpSquareRounded != null) return _helpSquareRounded!!
        _helpSquareRounded = tablerFilledIcon(
            name = "HelpSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2l.642 .005 .616 .017 .299 .013 .579 .034 .553 .046c4.687 .455 6.65 2.333 7.166 6.906l.03 .29 .046 .553 .041 .727 .006 .15 .017 .617L22 12l-.005 .642-.017 .616-.013 .299-.034 .579-.046 .553c-.455 4.687-2.333 6.65-6.906 7.166l-.29 .03-.553 .046-.727 .041-.15 .006-.617 .017L12 22l-.642-.005-.616-.017-.299-.013-.579-.034-.553-.046C4.624 21.43 2.661 19.552 2.145 14.979l-.03-.29-.046-.553-.041-.727-.006-.15-.017-.617-.004-.318v-.648l.004-.318 .017-.616 .013-.299 .034-.579 .046-.553C2.57 4.624 4.448 2.661 9.021 2.145l.29-.03 .553-.046 .727-.041 .15-.006 .617-.017C11.568 2.002 11.782 2 12 2ZM12 15c-.507 0-.934 .38-.993 .883L11 16l.007 .127c.06 .503 .486 .882 .993 .882 .507 0 .933-.379 .993-.882L13 16.01l-.007-.127C12.934 15.38 12.507 15 12 15ZM13.368 8.327C12.135 7.697 10.631 7.998 9.737 9.055c-.344 .403-.314 1.004 .068 1.371 .382 .367 .984 .372 1.372 .012l.171-.18c.302-.277 .745-.337 1.11-.15 .394 .2 .611 .635 .533 1.07-.078 .435-.433 .767-.873 .816l-.232 .012c-.528 .058-.919 .519-.889 1.05 .03 .531 .469 .945 1 .944 1.389 .004 2.599-.945 2.925-2.295 .326-1.35-.317-2.747-1.554-3.378Z"),
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
        return _helpSquareRounded!!
    }

private var _helpSquareRounded: ImageVector? = null
