package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleNumber3: ImageVector
    get() {
        if (_circleNumber3 != null) return _circleNumber3!!
        _circleNumber3 = tablerFilledIcon(
            name = "CircleNumber3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM13 7h-2l-.15 .005C9.806 7.083 9 7.953 9 9c-.002 .509 .379 .938 .884 .997 .505 .059 .974-.271 1.09-.767l.02-.113L11 9h2v2h-2l-.133 .007c-1.111 .12-1.154 1.73-.128 1.965l.128 .021L11 13h2v2h-2l-.007-.117c-.062-.525-.523-.911-1.052-.88C9.413 14.034 9.001 14.471 9 15c-0 1.047 .806 1.917 1.85 1.995L11 17h2l.15-.005c.984-.074 1.767-.854 1.844-1.838L15 15v-2l-.005-.15c-.017-.231-.075-.456-.17-.667l-.075-.152-.019-.032 .02-.03c.135-.245 .218-.516 .242-.795L15 11v-2l-.005-.15C14.921 7.866 14.141 7.083 13.157 7.006L13 7Z"),
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
        return _circleNumber3!!
    }

private var _circleNumber3: ImageVector? = null
