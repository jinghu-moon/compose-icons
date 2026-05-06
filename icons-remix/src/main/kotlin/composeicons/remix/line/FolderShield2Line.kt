package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FolderShield2Line: ImageVector
    get() {
        if (_folderShield2Line != null) return _folderShield2Line!!
        _folderShield2Line = remixIcon(
            name = "FolderShield2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22 9h-2v-2h-8.414L9.586 5h-5.586v14h7.447c.362 .792 .932 1.485 1.664 2h-10.111C2.448 21 2 20.552 2 20v-16C2 3.448 2.448 3 3 3h7.414l2 2h8.586c.552 0 1 .448 1 1v3ZM13 11h9v5.949c0 .991-.501 1.916-1.336 2.465l-3.164 2.083L14.336 19.414C13.501 18.865 13 17.94 13 16.949v-5.949ZM15 16.949c0 .316 .162 .614 .436 .795l2.064 1.359 2.064-1.359c.274-.181 .436-.479 .436-.795v-3.949h-5v3.949Z"),
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
        return _folderShield2Line!!
    }

private var _folderShield2Line: ImageVector? = null
