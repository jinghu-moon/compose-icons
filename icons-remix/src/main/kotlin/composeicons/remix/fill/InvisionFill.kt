package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.InvisionFill: ImageVector
    get() {
        if (_invisionFill != null) return _invisionFill!!
        _invisionFill = remixIcon(
            name = "InvisionFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.001 3h16c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-16c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1ZM6.989 14.065c-.06 .267-.091 .555-.091 .79 0 .927 .483 1.542 1.509 1.542 .851 0 1.541-.526 2.038-1.375l-.303 1.267h1.69l.966-4.031c.241-1.021 .709-1.55 1.419-1.55 .558 0 .906 .361 .906 .958 0 .173-.015 .361-.075 .565l-.498 1.853c-.075 .267-.106 .534-.106 .785 0 .88 .498 1.523 1.539 1.523 .891 0 1.6-.596 1.992-2.025l-.664-.267c-.332 .957-.619 1.13-.845 1.13-.226 0-.347-.157-.347-.471 0-.141 .03-.298 .076-.487l.483-1.805c.121-.424 .166-.8 .166-1.145 0-1.35-.785-2.055-1.736-2.055-.89 0-1.796 .836-2.249 1.715l.332-1.578h-2.581l-.362 1.39h1.207l-.743 3.097c-.584 1.35-1.656 1.372-1.791 1.341-.221-.052-.362-.139-.362-.438 0-.172 .03-.42 .106-.719L9.796 9.403h-2.867l-.362 1.39h1.192l-.77 3.271ZM8.626 8.625c.621 0 1.125-.504 1.125-1.125C9.751 6.879 9.247 6.375 8.626 6.375c-.621 0-1.125 .504-1.125 1.125 0 .621 .504 1.125 1.125 1.125Z"),
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
        return _invisionFill!!
    }

private var _invisionFill: ImageVector? = null
