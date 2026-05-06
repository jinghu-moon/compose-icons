package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bong: ImageVector
    get() {
        if (_bong != null) return _bong!!
        _bong = tablerFilledIcon(
            name = "Bong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 2c.552 0 1 .448 1 1 0 .552-.448 1-1 1v5.587L16.293 7.293c.356-.356 .922-.392 1.32-.083l.094 .083 2 2c.39 .391 .39 1.023 0 1.414l-3.116 3.115 .086 .233c.311 .907 .396 1.865 .263 2.794l-.062 .36-.012 .052c-.189 .877-.572 1.701-1.121 2.41l-.16 .199c-1.448 1.716-3.734 2.479-5.923 1.978C7.474 21.348 5.748 19.667 5.189 17.492l-.068-.288-.009-.046c-.491-2.495 .644-5.029 2.833-6.324L8 10.803v-6.803C7.448 4 7 3.552 7 3 7 2.448 7.448 2 8 2ZM12 4h-2v7.416c0 .35-.183 .675-.483 .856l-.117 .06C7.942 12.968 6.999 14.409 7 16h8c.001-.669-.167-1.327-.486-1.914-.212-.389-.143-.871 .17-1.185L17.586 10 17 9.414l-2.9 2.902c-.28 .28-.698 .368-1.067 .226l-.12-.056c-.103-.056-.208-.108-.316-.155-.363-.16-.597-.519-.597-.915Z"),
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
        return _bong!!
    }

private var _bong: ImageVector? = null
