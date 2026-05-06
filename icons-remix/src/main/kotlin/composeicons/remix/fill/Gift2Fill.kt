package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Gift2Fill: ImageVector
    get() {
        if (_gift2Fill != null) return _gift2Fill!!
        _gift2Fill = remixIcon(
            name = "Gift2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.005 13.003v7c0 .552-.448 1-1 1h-14c-.552 0-1-.448-1-1v-7h16ZM14.505 2.003c1.933 0 3.5 1.567 3.5 3.5 0 .537-.121 1.046-.337 1.501l3.337-.001c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-3c0-.552 .448-1 1-1l3.337 .001C6.126 6.549 6.005 6.04 6.005 5.503 6.005 3.57 7.572 2.003 9.505 2.003c.98 0 1.866 .403 2.501 1.052 .633-.649 1.519-1.052 2.499-1.052ZM9.505 4.003c-.828 0-1.5 .672-1.5 1.5 0 .78 .595 1.42 1.356 1.493l.144 .007h1.5v-1.5c0-.78-.595-1.42-1.356-1.493L9.505 4.003ZM14.505 4.003l-.144 .007c-.713 .068-1.281 .636-1.349 1.349l-.007 .144v1.5h1.5l.144-.007c.761-.073 1.356-.713 1.356-1.493 0-.78-.595-1.42-1.356-1.493l-.144-.007Z"),
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
        return _gift2Fill!!
    }

private var _gift2Fill: ImageVector? = null
