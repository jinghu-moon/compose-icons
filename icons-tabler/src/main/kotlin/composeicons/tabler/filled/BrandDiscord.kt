package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandDiscord: ImageVector
    get() {
        if (_brandDiscord != null) return _brandDiscord!!
        _brandDiscord = tablerFilledIcon(
            name = "BrandDiscord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.983 3l.123 .006c2.014 .214 3.527 .672 4.966 1.673 .172 .12 .301 .291 .371 .488 1.876 5.315 2.373 9.987 1.451 12.28C20.891 19.452 19.288 21 17.5 21c-.732 0-1.693-.968-2.328-2.045 .709-.129 1.411-.294 2.103-.493 .531-.152 .839-.706 .687-1.237-.152-.531-.706-.839-1.237-.687-3.32 .95-6.13 .95-9.45 0-.531-.152-1.085 .156-1.237 .687-.152 .531 .156 1.085 .687 1.237 .717 .204 1.416 .37 2.103 .494C8.193 20.031 7.232 21 6.5 21 4.712 21 3.109 19.452 2.072 17.371 1.184 15.154 1.682 10.481 3.557 5.167c.07-.197 .199-.368 .371-.488C5.367 3.678 6.88 3.22 8.894 3.006c.368-.039 .728 .128 .935 .435l.063 .107 .651 1.285 .137-.016c.879-.09 1.764-.09 2.643 0l.134 .016 .65-1.284c.148-.293 .429-.494 .754-.54L14.983 3ZM9 10c-.988-0-1.827 .721-1.977 1.697l-.018 .154L7 12l.005 .15c.081 1.082 1.011 1.902 2.094 1.848 1.084-.054 1.926-.962 1.9-2.047C10.972 10.866 10.085 10 9 10ZM15 10c-.988-0-1.827 .721-1.977 1.697l-.018 .154L13 12l.005 .15c.081 1.082 1.011 1.902 2.094 1.848 1.084-.054 1.926-.962 1.9-2.047C16.972 10.866 16.085 10 15 10Z"),
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
        return _brandDiscord!!
    }

private var _brandDiscord: ImageVector? = null
