package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RedditLine: ImageVector
    get() {
        if (_redditLine != null) return _redditLine!!
        _redditLine = remixIcon(
            name = "RedditLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.053 7.815l.752-3.536c.23-1.08 1.292-1.77 2.372-1.54l3.196 .679c.463-.513 1.178-.772 1.903-.618 1.08 .23 1.77 1.292 1.541 2.372-.23 1.08-1.292 1.77-2.372 1.54C17.719 6.559 17.171 6.031 16.957 5.375L13.76 4.695l-.666 3.135c1.785 .137 3.558 .731 5.164 1.7 .831-.462 1.841-.536 2.749-.169 1.166 .472 1.946 1.585 1.992 2.842l0 .021c.016 1.004-.441 1.942-1.208 2.55-.002 .044-.005 .085-.008 .123 0 3.998-4.449 7.03-9.798 7.03-5.333 0-9.708-3.024-9.705-6.953-.005-.06-.008-.121-.011-.181C1.467 14.187 .985 13.228 1 12.196 1.02 10.932 1.783 9.798 2.948 9.305c.911-.386 1.933-.322 2.776 .139C7.358 8.467 9.158 7.912 11.053 7.815ZM20.338 13.341c.408-.203 .665-.62 .662-1.075-.021-.465-.311-.876-.744-1.051-.436-.176-.934-.08-1.273 .245l-.585 .561-.67-.456C16.114 10.467 14.277 9.84 12.5 9.801L11.493 9.801c-1.875 .028-3.652 .599-5.237 1.674l-.663 .45-.583-.549c-.344-.324-.847-.414-1.281-.23-.435 .184-.72 .608-.727 1.08-.007 .472 .265 .904 .694 1.101l.633 .291-.053 .695c-.013 .169-.013 .338 .003 .584 0 2.71 3.356 5.03 7.708 5.03 4.371 0 7.798-2.335 7.801-5.106 .013-.169 .013-.339 0-.507l-.052-.672 .604-.3ZM6.951 13.5c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.398 0-.779-.158-1.061-.439-.281-.281-.439-.663-.439-1.061ZM13.951 13.5c0-.828 .672-1.5 1.5-1.5 .828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-.398 0-.779-.158-1.061-.439-.281-.281-.439-.663-.439-1.061ZM11.967 18.603c-1.397 0-2.767-.37-3.881-1.21-.138-.169-.126-.415 .028-.569 .154-.154 .4-.166 .569-.028 .945 .693 2.123 .99 3.269 .99 1.146 0 2.331-.274 3.284-.958 .112-.11 .274-.151 .425-.108 .151 .042 .268 .162 .306 .314 .039 .152-.015 .302-.119 .423-.684 .797-2.484 1.147-3.881 1.147Z"),
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
        return _redditLine!!
    }

private var _redditLine: ImageVector? = null
