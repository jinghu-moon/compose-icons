package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Safe2Fill: ImageVector
    get() {
        if (_safe2Fill != null) return _safe2Fill!!
        _safe2Fill = remixIcon(
            name = "Safe2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.005 20h-4v2h-2v-2h-1c-.552 0-1-.448-1-1v-15c0-.552 .448-1 1-1h7v-1.41c0-.276 .224-.5 .5-.5 .028 0 .055 .002 .082 .007L21.169 2.861c.482 .08 .836 .498 .836 .986v2.153h1v2h-1v7h1v2h-1v2.153c0 .489-.353 .906-.836 .986l-1.164 .194v1.667h-2v-1.333l-7.418 1.236c-.272 .045-.53-.139-.575-.411-.004-.027-.007-.055-.007-.082v-1.41ZM12.005 19.639l8-1.333v-13.611l-8-1.333v16.278ZM16.505 14c-.828 0-1.5-1.119-1.5-2.5 0-1.381 .672-2.5 1.5-2.5 .828 0 1.5 1.119 1.5 2.5 0 1.381-.672 2.5-1.5 2.5Z"),
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
        return _safe2Fill!!
    }

private var _safe2Fill: ImageVector? = null
