package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpaceShip2Line: ImageVector
    get() {
        if (_spaceShip2Line != null) return _spaceShip2Line!!
        _spaceShip2Line = remixIcon(
            name = "SpaceShip2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.949 17.293c.39-.39 1.024-.39 1.414 0 .391 .39 .391 1.024 0 1.415L9.524 21.546c-.391 .39-1.024 .391-1.414 0-.39-.391-.39-1.024 0-1.414l2.839-2.839ZM9.172 13.414c.391-.39 1.024-.39 1.414 0 .391 .391 .391 1.024 0 1.415L4.929 20.485c-.391 .39-1.024 .39-1.414 0-.39-.391-.39-1.024 0-1.414L9.172 13.414ZM17.423 2.713c1.218-.489 2.454-.188 3.253 .61 .799 .799 1.099 2.035 .61 3.253L17.032 17.173c-.159 .396-.552 .647-.979 .626-.426-.021-.792-.311-.91-.721-.556-1.921-1.569-3.7-3.046-5.177C10.621 10.425 8.842 9.412 6.921 8.856 6.511 8.738 6.222 8.372 6.2 7.946c-.021-.426 .23-.819 .626-.979L17.423 2.713ZM5.293 11.637c.391-.39 1.024-.391 1.414 0 .39 .391 .39 1.024 0 1.414L3.868 15.889c-.39 .39-1.024 .39-1.414 0-.391-.391-.39-1.024 0-1.414L5.293 11.637ZM19.262 4.737c-.229-.229-.615-.361-1.094-.169L9.908 7.885c1.306 .655 2.524 1.523 3.603 2.603 1.08 1.08 1.947 2.297 2.603 3.604L19.431 5.832c.192-.479 .06-.866-.169-1.095Z"),
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
        return _spaceShip2Line!!
    }

private var _spaceShip2Line: ImageVector? = null
