package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SpaceShip2Fill: ImageVector
    get() {
        if (_spaceShip2Fill != null) return _spaceShip2Fill!!
        _spaceShip2Fill = remixIcon(
            name = "SpaceShip2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.949 17.293c.39-.39 1.024-.39 1.414 0 .391 .391 .391 1.025 0 1.415L9.524 21.546c-.391 .391-1.024 .391-1.414 0-.39-.39-.39-1.024 0-1.414l2.839-2.839ZM9.172 13.414c.391-.39 1.024-.39 1.414 0 .391 .391 .391 1.024 0 1.415L4.929 20.485c-.391 .39-1.024 .391-1.414 0-.39-.391-.39-1.024 0-1.414L9.172 13.414ZM17.423 2.713c1.218-.489 2.454-.188 3.253 .61 .799 .799 1.099 2.035 .61 3.253L17.032 17.173c-.159 .396-.552 .647-.979 .626-.426-.021-.792-.311-.91-.721-.556-1.921-1.569-3.7-3.046-5.177C10.621 10.425 8.842 9.412 6.921 8.856 6.511 8.738 6.222 8.372 6.2 7.946c-.021-.426 .23-.819 .626-.979L17.423 2.713ZM5.293 11.637c.391-.39 1.024-.39 1.414 0 .39 .391 .39 1.024 0 1.414L3.868 15.889c-.39 .39-1.024 .39-1.414 0-.391-.391-.39-1.023 0-1.414L5.293 11.637Z"),
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
        return _spaceShip2Fill!!
    }

private var _spaceShip2Fill: ImageVector? = null
