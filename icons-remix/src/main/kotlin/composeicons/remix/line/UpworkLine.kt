package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UpworkLine: ImageVector
    get() {
        if (_upworkLine != null) return _upworkLine!!
        _upworkLine = remixIcon(
            name = "UpworkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C7.582 4 4 7.582 4 12c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C20 7.582 16.418 4 12 4ZM16.152 8.295c.444-.004 .885 .081 1.295 .251 .41 .17 .782 .419 1.094 .735 .312 .316 .556 .693 .72 1.105 .163 .413 .243 .854 .233 1.298 .014 .445-.062 .889-.224 1.305-.162 .415-.405 .794-.717 1.112-.312 .319-.685 .571-1.097 .741-.412 .171-.854 .256-1.3 .251h-.139c-.599-.022-1.182-.201-1.688-.521-.195-.122-.38-.258-.555-.408l-.526 3.23h-1.517l.8-4.56C11.848 11.834 11.343 10.723 11.037 9.551v2.179c-0 1.978-1.26 3.36-3.059 3.36-.423 .011-.845-.069-1.234-.234-.39-.165-.739-.412-1.025-.724-.587-.674-.895-1.546-.861-2.439v-3.223h1.493v3.223c0 1.175 .592 2.039 1.632 2.039 1.04-0 1.57-.868 1.57-2.039v-3.223h2.599c.174 .792 .438 1.561 .787 2.293 .161-.726 .572-1.372 1.161-1.825 .515-.397 1.138-.624 1.783-.654l.269 .012ZM16.16 9.645c-1.052 0-1.848 .678-2.121 2.855 .227 .362 .538 .665 .905 .882 .322 .19 .679 .31 1.049 .353l.167-.011c1.036 0 1.852-.816 1.852-2.039 0-1.224-.8-2.04-1.852-2.04Z"),
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
        return _upworkLine!!
    }

private var _upworkLine: ImageVector? = null
