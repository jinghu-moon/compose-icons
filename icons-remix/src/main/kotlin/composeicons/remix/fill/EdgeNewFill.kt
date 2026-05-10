package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EdgeNewFill: ImageVector
    get() {
        if (_edgeNewFill != null) return _edgeNewFill!!
        _edgeNewFill = remixIcon(
            name = "EdgeNewFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.817 21.835c-.106 .003-.212 .005-.317 .005-1.073 0-2.374-.621-3.419-1.758C9.045 18.955 8.3 17.363 8.3 15.5c0-1.418 .518-2.565 1.201-3.406 .057 2.485 2.358 5.606 6.999 5.606 1.678 0 2.717-.452 3.279-.697 .208-.091 .351-.153 .437-.153 .184 0 .284 .1 .284 .3 0 .187-.101 .321-.426 .752L20.001 18c-1.478 1.968-3.666 3.373-6.184 3.835ZM10.702 21.917C5.792 21.28 2 17.083 2 12 2 10.72 2.741 9.671 3.897 8.919 5.058 8.165 6.587 7.75 8 7.75c2.276 0 3.635 .765 4.428 1.647 .05 .056 .098 .112 .144 .169C12.389 9.523 12.197 9.5 12 9.5h-.004c-.435 .001-.844 .113-1.2 .309-.078 .036-.157 .076-.235 .117-.504 .268-1.031 .661-1.511 1.168-.962 1.016-1.749 2.51-1.749 4.406 0 2.137 .855 3.965 2.044 5.258 .414 .45 .873 .841 1.357 1.158ZM13.851 13.596c.266-.281 .649-.683 .649-1.596 0-.861-.337-2.171-1.328-3.272C12.165 7.61 10.524 6.75 8 6.75c-1.587 0-3.308 .46-4.647 1.331-.28 .182-.545 .383-.79 .604C3.93 4.791 7.639 2 12 2c5.523 0 10 4 10 8.5 0 2.8-2.2 4.85-5 4.85-2 0-3.4-.65-3.4-1.35 0-.139 .109-.254 .251-.404Z"),
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
        return _edgeNewFill!!
    }

private var _edgeNewFill: ImageVector? = null
