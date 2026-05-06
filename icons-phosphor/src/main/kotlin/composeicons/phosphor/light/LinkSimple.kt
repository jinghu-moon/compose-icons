package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) return _linkSimple!!
        _linkSimple = phosphorLightIcon(
            name = "LinkSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164.25 91.75c1.127 1.125 1.76 2.653 1.76 4.245 0 1.592-.633 3.12-1.76 4.245l-64 64c-2.347 2.312-6.12 2.299-8.451-.029-2.331-2.328-2.349-6.101-.039-8.451L155.76 91.76c1.124-1.128 2.65-1.763 4.243-1.765 1.592-.002 3.12 .629 4.247 1.755ZM214.2 41.8c-21.106-21.058-55.274-21.058-76.38 0L107.75 71.85c-2.344 2.344-2.344 6.146 0 8.49 2.344 2.344 6.146 2.344 8.49 0L146.31 50.28c16.406-16.406 43.004-16.406 59.41 0 16.406 16.406 16.406 43.004 0 59.41l-30.08 30.07c-2.344 2.344-2.344 6.146 0 8.49 2.344 2.344 6.146 2.344 8.49 0l30.07-30.07c10.131-10.127 15.822-23.865 15.822-38.19 0-14.325-5.692-28.063-15.822-38.19ZM139.76 175.64l-30.07 30.08c-16.406 16.406-43.004 16.406-59.41 0-16.406-16.406-16.406-43.004 0-59.41L80.34 116.24c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0l-30 30.07c-21.095 21.092-21.097 55.29-.005 76.385 21.092 21.095 55.29 21.097 76.385 .005l30.07-30.08c2.344-2.344 2.344-6.146 0-8.49-2.344-2.344-6.146-2.344-8.49 0Z"),
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
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
