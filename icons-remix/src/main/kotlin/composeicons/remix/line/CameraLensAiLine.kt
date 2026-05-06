package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CameraLensAiLine: ImageVector
    get() {
        if (_cameraLensAiLine != null) return _cameraLensAiLine!!
        _cameraLensAiLine = remixIcon(
            name = "CameraLensAiLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.467 8.694l.247-.566c.44-1.009 1.231-1.812 2.219-2.251l.76-.338c.411-.183 .411-.78 0-.963l-.717-.319C21.962 3.807 21.156 2.974 20.724 1.931l-.253-.611c-.176-.426-.765-.426-.941 0l-.253 .611c-.432 1.043-1.238 1.876-2.251 2.326l-.717 .319c-.411 .183-.411 .78 0 .963l.76 .338c.988 .439 1.779 1.242 2.219 2.251l.247 .566c.181 .414 .753 .414 .934 0ZM12 22c5.523 0 10-4.477 10-10 0-.403-.024-.8-.07-1.19l-1.986 .236c.037 .313 .056 .632 .056 .955 0 1.458-.39 2.824-1.071 4.001L15.464 10h2.465L16.775 8h-4.775L15.169 2.512C14.173 2.18 13.107 2 12 2 6.477 2 2 6.477 2 12c0 5.523 4.477 10 10 10ZM12 4 8.536 10 6.395 6.292C7.838 4.874 9.817 4 12 4ZM9.691 12 10.846 10h2.309l1.155 2L13.155 14h-2.31L9.691 12ZM12 16 9.858 19.71C7.819 19.145 6.107 17.792 5.07 16h6.93ZM12 20l3.464-6 2.141 3.708C16.162 19.126 14.183 20 12 20ZM5.071 7.999 8.536 14h-4.284C4.088 13.361 4 12.691 4 12 4 10.542 4.39 9.176 5.071 7.999Z"),
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
        return _cameraLensAiLine!!
    }

private var _cameraLensAiLine: ImageVector? = null
