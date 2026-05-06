package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYarn: ImageVector
    get() {
        if (_brandYarn != null) return _brandYarn!!
        _brandYarn = tablerOutlineIcon(
            name = "BrandYarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.845 19.308C16.577 20.122 15.435 20.562 14 21c-.176 .21-.645 .544-.912 .588-1.491 .217-2.992 .355-4.498 .412-.812 .006-1.31-.214-1.447-.554-.115-.279 .336-2.054 .298-1.964-.157 .392-.575 1.287-.997 1.72-.579 .6-1.674 .4-2.322 .051-.71-.386-.07-1.28-.346-1.267C3.5 20 3 18.5 3 17.75c0-.828 .622-1.674 1.235-2.211-.097-1.069 .061-2.146 .46-3.143C5.217 11.364 5.973 10.469 6.903 9.781c0 0-1.353-1.534-.849-2.912 .328-.902 .46-.895 .567-.935 .38-.12 .727-.33 1.013-.612C8.414 4.442 9.594 3.884 10.75 4c0 0 .781-2.43 1.533-1.936 .415 .653 .671 1.218 .967 1.936 0 0 1.15-.7 1.25-.5 .514 1.398 .487 3.204 .211 4.67C14.387 9.578 13.871 10.861 13 12c-.094 .16 .98 .705 1.722 2.812 .686 1.928 .278 2.438 .278 2.688 0 .25 .716 .144 2.296-.855 .869-.651 1.902-1.048 2.984-1.145 .735-.066 .988-.035 1.22 1 .232 1.035-.346 1.406-.744 1.506 0 0-2.09 .675-2.911 1.302"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandYarn!!
    }

private var _brandYarn: ImageVector? = null
