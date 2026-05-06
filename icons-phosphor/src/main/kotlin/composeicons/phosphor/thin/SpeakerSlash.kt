package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) return _speakerSlash!!
        _speakerSlash = phosphorThinIcon(
            name = "SpeakerSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L81 82.19 78.63 84h-46.63C25.373 84 20 89.373 20 96v64c0 6.627 5.373 12 12 12h46.63l70.91 55.16c.706 .541 1.57 .836 2.46 .84 .611 .002 1.213-.138 1.76-.41 1.37-.671 2.239-2.064 2.24-3.59v-59.25l49 53.94c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM28 160v-64c0-2.209 1.791-4 4-4h44v72h-44c-2.209 0-4-1.791-4-4ZM148 215.82 84 166v-76l2.35-1.83L148 156ZM189 146.52c9.31-10.577 9.31-26.423 0-37-.972-1.068-1.293-2.577-.839-3.948 .453-1.371 1.611-2.391 3.028-2.669 1.417-.278 2.874 .229 3.812 1.327 11.98 13.601 11.98 33.989 0 47.59-.938 1.098-2.395 1.605-3.812 1.327-1.417-.278-2.574-1.298-3.028-2.669-.453-1.371-.133-2.88 .839-3.948ZM109 65.45c-1.354-1.743-1.041-4.253 .7-5.61l39.85-31c1.206-.935 2.839-1.102 4.21-.43 1.37 .671 2.239 2.064 2.24 3.59v74.83c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-66.65l-33.39 26c-.841 .647-1.904 .934-2.956 .797-1.052-.137-2.007-.686-2.654-1.527ZM244 128c.013 18.697-6.878 36.741-19.35 50.67-1.475 1.657-4.013 1.805-5.67 .33-1.657-1.475-1.805-4.013-.33-5.67 23.084-25.812 23.084-64.848 0-90.66-1.475-1.657-1.327-4.195 .33-5.67 1.657-1.475 4.195-1.327 5.67 .33C237.122 91.259 244.013 109.303 244 128Z"),
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
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
