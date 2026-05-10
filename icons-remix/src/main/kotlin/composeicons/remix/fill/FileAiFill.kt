package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.FileAiFill: ImageVector
    get() {
        if (_fileAiFill != null) return _fileAiFill!!
        _fileAiFill = remixIcon(
            name = "FileAiFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.343 2c-.221 .626-.343 1.299-.343 2 0 3.314 2.686 6 6 6 .701 0 1.374-.122 2-.343v11.351c0 .548-.445 .992-.993 .992h-16.014C3.445 22 3 21.55 3 20.993v-12.993L9.003 2h4.34ZM4.5 9h5.5v-5.5L4.5 9ZM18.529 .329c.177-.426 .765-.426 .941 0l.253 .611c.432 1.043 1.238 1.876 2.251 2.326l.718 .319c.41 .183 .41 .78 0 .963l-.76 .338c-.988 .439-1.779 1.242-2.219 2.251l-.247 .565c-.18 .414-.753 .414-.934 0l-.246-.565C17.848 6.129 17.055 5.326 16.067 4.887l-.76-.338c-.41-.183-.41-.78 0-.963l.718-.319C17.038 2.816 17.844 1.983 18.276 .941l.253-.611Z"),
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
        return _fileAiFill!!
    }

private var _fileAiFill: ImageVector? = null
