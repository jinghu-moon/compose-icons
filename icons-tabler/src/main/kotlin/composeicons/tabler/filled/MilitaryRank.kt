package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MilitaryRank: ImageVector
    get() {
        if (_militaryRank != null) return _militaryRank!!
        _militaryRank = tablerFilledIcon(
            name = "MilitaryRank",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.555 2.168l6 4c.278 .186 .445 .498 .445 .832v12c0 1.657-1.343 3-3 3h-8C6.343 22 5 20.657 5 19v-12c-0-.334 .167-.646 .445-.832L11.445 2.168c.336-.224 .774-.224 1.11 0M12.447 15.106c-.281-.141-.613-.141-.894 0l-2 1c-.494 .247-.694 .847-.447 1.341l.058 .102c.278 .424 .83 .572 1.283 .345L12 17.118l1.553 .776c.49 .227 1.072 .023 1.314-.461 .242-.483 .056-1.071-.42-1.327ZM12.447 11.106c-.281-.141-.613-.141-.894 0l-2 1c-.494 .247-.694 .847-.447 1.341l.058 .102c.278 .424 .83 .572 1.283 .345L12 13.118l1.553 .776c.49 .227 1.072 .023 1.314-.461 .242-.483 .056-1.071-.42-1.327ZM12.447 7.106c-.281-.141-.613-.141-.894 0l-2 1c-.494 .247-.694 .847-.447 1.341l.058 .102c.278 .424 .83 .572 1.283 .345L12 9.118l1.553 .776c.49 .227 1.072 .023 1.314-.461 .242-.483 .056-1.071-.42-1.327Z"),
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
        return _militaryRank!!
    }

private var _militaryRank: ImageVector? = null
