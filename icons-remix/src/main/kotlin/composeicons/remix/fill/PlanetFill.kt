package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PlanetFill: ImageVector
    get() {
        if (_planetFill != null) return _planetFill!!
        _planetFill = remixIcon(
            name = "PlanetFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.322 5.966c.101-.112 .206-.222 .314-.33C6.119 5.153 6.644 4.736 7.199 4.385 6.885 4.299 6.603 4.247 6.355 4.229c-.572-.043-.823 .093-.93 .2-.107 .107-.243 .358-.2 .93 .014 .184 .046 .386 .097 .607ZM20.726 14.211c.062 .123 .121 .245 .177 .366 .476 1.021 .791 2.018 .859 2.914 .067 .892-.106 1.82-.78 2.495-.674 .674-1.603 .847-2.494 .78-.781-.059-1.638-.305-2.521-.683l-.003 .001c-.153-.066-.307-.135-.462-.208C13.469 18.912 11.144 17.221 8.96 15.037 6.779 12.856 5.088 10.532 4.125 8.501 4.052 8.346 3.982 8.191 3.916 8.038l.001-.002C3.538 7.151 3.291 6.291 3.232 5.509 3.164 4.617 3.337 3.688 4.011 3.014c.674-.674 1.603-.847 2.495-.78 .896 .068 1.893 .382 2.914 .859 .123 .057 .247 .118 .372 .18 2.97-.749 6.249 .039 8.572 2.362 2.324 2.324 3.111 5.603 2.362 8.575ZM19.613 16.804c-.35 .554-.766 1.077-1.249 1.56-.107 .107-.216 .211-.327 .311 .218 .05 .419 .081 .601 .095 .572 .043 .823-.093 .93-.2 .107-.107 .243-.358 .2-.93-.018-.245-.069-.525-.154-.837ZM5.636 18.364C3.372 16.1 2.567 12.931 3.219 10.022c1.082 1.981 2.705 4.1 4.68 6.075 1.977 1.977 4.098 3.601 6.08 4.683-2.909 .653-6.079-.153-8.343-2.417Z"),
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
        return _planetFill!!
    }

private var _planetFill: ImageVector? = null
