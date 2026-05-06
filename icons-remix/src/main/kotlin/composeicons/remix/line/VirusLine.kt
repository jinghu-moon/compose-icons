package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.VirusLine: ImageVector
    get() {
        if (_virusLine != null) return _virusLine!!
        _virusLine = remixIcon(
            name = "VirusLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.716 1.947l3.734 1.433-.717 1.867-.934-.359-.746 1.945c.779 .461 1.444 1.094 1.945 1.846l1.903-.848-.407-.914 1.827-.813 1.627 3.654-1.827 .813-.407-.914-1.902 .847c.122 .477 .187 .977 .187 1.493 0 .406-.04 .803-.117 1.187l1.944 .746 .359-.933 1.867 .717-1.433 3.734-1.867-.717 .358-.933-1.944-.747c-.462 .779-1.094 1.444-1.846 1.945l.848 1.903 .914-.407 .814 1.827-3.654 1.627-.813-1.827 .914-.407-.848-1.902c-.477 .122-.977 .187-1.493 .187-.407 0-.804-.041-1.188-.118l-.746 1.945 .934 .358-.717 1.867L6.549 20.619l.717-1.867 .932 .358 .748-1.944C8.167 16.704 7.501 16.072 7.001 15.319l-1.903 .848 .407 .914-1.827 .813L2.051 14.24l1.827-.814 .406 .914 1.903-.848C6.065 13.016 6 12.515 6 12c0-.406 .04-.803 .117-1.187L4.172 10.067l-.357 .933L1.947 10.283 3.381 6.549l1.867 .717-.359 .933 1.945 .747C7.296 8.167 7.928 7.502 8.68 7.001L7.832 5.098l-.914 .407L6.105 3.678 9.76 2.051l.813 1.827-.914 .407 .847 1.902c.477-.122 .977-.187 1.493-.187 .406 0 .803 .04 1.187 .117l.746-1.945-.932-.358 .717-1.867ZM12 8C9.791 8 8 9.791 8 12c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM11.5 12.866c.478 .276 .642 .888 .366 1.366-.276 .478-.888 .642-1.366 .366-.478-.276-.642-.888-.366-1.366 .276-.478 .888-.642 1.366-.366ZM14 11c.552 0 1 .448 1 1 0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1ZM11.866 9.768c.276 .478 .112 1.09-.366 1.366-.478 .276-1.09 .112-1.366-.366-.276-.478-.112-1.09 .366-1.366 .478-.276 1.09-.112 1.366 .366Z"),
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
        return _virusLine!!
    }

private var _virusLine: ImageVector? = null
