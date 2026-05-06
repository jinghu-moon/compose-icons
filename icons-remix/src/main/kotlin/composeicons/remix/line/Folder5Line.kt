package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Folder5Line: ImageVector
    get() {
        if (_folder5Line != null) return _folder5Line!!
        _folder5Line = remixIcon(
            name = "Folder5Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3.087 9h17.826c.552 0 1 .448 1 1 0 .028-.001 .055-.003 .083l-.833 10c-.043 .518-.476 .917-.997 .917h-16.16c-.52 0-.953-.399-.997-.917l-.833-10C2.045 9.533 2.454 9.049 3.004 9.003 3.032 9.001 3.059 9 3.087 9ZM4.84 19h14.319l.667-8h-15.653l.667 8ZM13.414 5h6.586c.552 0 1 .448 1 1v1h-18v-3c0-.552 .448-1 1-1h7.414l2 2Z"),
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
        return _folder5Line!!
    }

private var _folder5Line: ImageVector? = null
