package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UbuntuLine: ImageVector
    get() {
        if (_ubuntuLine != null) return _ubuntuLine!!
        _ubuntuLine = remixIcon(
            name = "UbuntuLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.668 19.273 9.674 17.531c2.748 1.16 5.994 .119 7.523-2.531 .413-.715 .662-1.479 .758-2.25h2.012c-.104 1.112-.444 2.219-1.038 3.25-.403 .697-.894 1.311-1.452 1.835-.639-.194-1.353-.133-1.976 .227-.623 .36-1.032 .947-1.184 1.595-1.817 .549-3.825 .454-5.649-.384ZM7.369 18.523C5.73 17.362 4.644 15.671 4.211 13.823c.486-.456 .789-1.104 .789-1.823 0-.72-.304-1.369-.791-1.825 .175-.745 .461-1.478 .863-2.175C5.668 6.97 6.457 6.122 7.368 5.476L8.374 7.218C7.755 7.687 7.218 8.285 6.805 9c-1.53 2.65-.809 5.981 1.57 7.781L7.369 18.523ZM8.668 4.727c1.744-.798 3.755-.961 5.649-.386 .152 .65 .561 1.237 1.185 1.597 .623 .36 1.337 .421 1.976 .227 1.444 1.353 2.308 3.175 2.49 5.085h-2.012C17.726 9.453 16.691 7.779 15.001 6.804 13.311 5.828 11.344 5.768 9.674 6.469L8.668 4.727ZM16.001 5.072c-.717-.414-.963-1.332-.549-2.049 .414-.717 1.332-.963 2.049-.549 .717 .414 .963 1.332 .549 2.049-.414 .717-1.332 .963-2.049 .549ZM4.001 12c0 .828-.672 1.5-1.5 1.5C1.673 13.5 1.001 12.828 1.001 12c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5ZM16.001 18.928c.717-.414 1.635-.168 2.049 .549 .414 .717 .168 1.635-.549 2.049-.717 .414-1.635 .168-2.049-.549-.414-.717-.168-1.635 .549-2.049Z"),
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
        return _ubuntuLine!!
    }

private var _ubuntuLine: ImageVector? = null
