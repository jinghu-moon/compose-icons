package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PlayReverseLargeLine: ImageVector
    get() {
        if (_playReverseLargeLine != null) return _playReverseLargeLine!!
        _playReverseLargeLine = remixIcon(
            name = "PlayReverseLargeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 18.392v-12.783L5.774 12 16 18.392ZM18 3.804v16.391c0 .785-.864 1.264-1.53 .848L3.357 12.848c-.627-.392-.627-1.304 0-1.696L16.47 2.956C17.136 2.54 18 3.019 18 3.804Z"),
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
        return _playReverseLargeLine!!
    }

private var _playReverseLargeLine: ImageVector? = null
