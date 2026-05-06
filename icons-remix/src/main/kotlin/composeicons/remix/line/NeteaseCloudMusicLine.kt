package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NeteaseCloudMusicLine: ImageVector
    get() {
        if (_neteaseCloudMusicLine != null) return _neteaseCloudMusicLine!!
        _neteaseCloudMusicLine = remixIcon(
            name = "NeteaseCloudMusicLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.422 11.375c-.294 1.028 .012 2.064 .784 2.653 1.061 .809 2.565 .301 2.874-.995 .08-.337 .104-.722 .027-1.056-.229-1.001-.521-1.988-.792-2.996-1.33 .154-2.543 1.172-2.892 2.394ZM15.97 11.088c.273 1.012 .286 2.017-.126 3-1.129 2.691-4.722 3.141-6.574 .826C7.968 13.287 7.991 10.953 9.33 9.18c.78-1.032 1.804-1.707 3.048-2.054 .123-.034 .247-.068 .379-.104-.083-.414-.188-.815-.242-1.223-.177-1.317 .512-2.504 1.744-3.041 1.225-.534 2.708-.215 3.531 .76 .405 .48 .394 1.081-.026 1.465-.412 .377-.997 .345-1.435-.091-.247-.245-.509-.44-.877-.435-.525 .007-.987 .418-.945 .938 .037 .468 .173 .93 .3 1.386 .022 .078 .216 .135 .338 .153 1.334 .197 2.504 .731 3.473 1.676 2.557 2.493 2.861 6.532 .672 9.441-1.529 2.031-3.61 3.168-6.127 3.408C8.54 21.898 4.497 18.928 3.462 14.399 2.515 10.255 4.84 5.831 8.795 4.25c.586-.234 1.143-.032 1.371 .498 .232 .537-.019 1.086-.611 1.35C7.188 7.158 5.739 8.953 5.341 11.521c-.533 3.433 1.656 6.777 5.001 7.721 2.723 .769 5.658-.167 7.308-2.33 1.586-2.08 1.399-5.099-.427-6.873C16.717 9.548 16.125 9.215 15.399 9.026c.199 .716 .389 1.388 .571 2.062Z"),
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
        return _neteaseCloudMusicLine!!
    }

private var _neteaseCloudMusicLine: ImageVector? = null
