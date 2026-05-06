package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BootstrapLine: ImageVector
    get() {
        if (_bootstrapLine != null) return _bootstrapLine!!
        _bootstrapLine = remixIcon(
            name = "BootstrapLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 11v2c0 0 2 0 2 4v1c0 1.657 1.343 3 3 3h12c1.657 0 3-1.343 3-3v-1c0-4 2-4 2-4v-2c0 0-2 0-2-4v-1C21 4.343 19.657 3 18 3h-12C4.343 3 3 4.343 3 6v1c0 4-2 4-2 4ZM20.674 12c-.03 .028-.059 .056-.088 .086C19.578 13.093 19 14.692 19 17v1c0 .552-.448 1-1 1h-12C5.448 19 5 18.552 5 18v-1C5 14.692 4.422 13.093 3.414 12.086 3.385 12.056 3.355 12.028 3.326 12c.03-.028 .059-.056 .088-.086C4.422 10.907 5 9.308 5 7v-1C5 5.448 5.448 5 6 5h12c.552 0 1 .448 1 1v1c0 2.308 .578 3.907 1.586 4.914 .029 .029 .059 .058 .088 .086ZM8.5 7v10h5c1.657 0 3-1.343 3-3 0-1.062-.552-1.996-1.385-2.529 .245-.435 .385-.937 .385-1.471 0-1.657-1.343-3-3-3h-4ZM10.5 11v-2h2c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-2ZM10.5 13h3c.552 0 1 .448 1 1 0 .552-.448 1-1 1h-3v-2Z"),
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
        return _bootstrapLine!!
    }

private var _bootstrapLine: ImageVector? = null
