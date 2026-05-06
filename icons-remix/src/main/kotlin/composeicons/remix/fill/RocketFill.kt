package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RocketFill: ImageVector
    get() {
        if (_rocketFill != null) return _rocketFill!!
        _rocketFill = remixIcon(
            name = "RocketFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.331 15.929c-.216-.937-.33-1.918-.33-2.929C5.001 7.912 7.903 3.564 12 1.818c4.097 1.746 7 6.094 7 11.182 0 1.01-.114 1.991-.33 2.929l2.02 1.796c.18 .16 .22 .425 .097 .631l-2.457 4.095c-.142 .237-.449 .314-.686 .171-.035-.021-.067-.046-.096-.075L15.293 20.293c-.188-.188-.442-.293-.707-.293h-5.172c-.265 0-.52 .105-.707 .293L6.453 22.547c-.195 .195-.512 .195-.707 0-.029-.029-.054-.061-.075-.096L3.214 18.355c-.124-.206-.083-.471 .097-.631L5.331 15.929ZM12 13c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.104 0-2 .895-2 2 0 1.105 .896 2 2 2Z"),
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
        return _rocketFill!!
    }

private var _rocketFill: ImageVector? = null
