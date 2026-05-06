package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MicrosoftCopilotLine: ImageVector
    get() {
        if (_microsoftCopilotLine != null) return _microsoftCopilotLine!!
        _microsoftCopilotLine = remixIcon(
            name = "MicrosoftCopilotLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.63 2.863c1.115 .089 2.083 .831 2.45 1.902l.548 1.603 .002 .005c.104 .308 .386 .521 .764 .525h.655c1.076 0 1.979 .321 2.589 1.039 .58 .684 .75 1.562 .762 2.37 .022 1.59-.574 3.535-1.023 5.006-.399 1.306-.923 2.699-1.641 3.783-.709 1.071-1.756 2.049-3.232 2.049h-.001L9.59 21.138v-.001C8.382 21.136 7.308 20.369 6.917 19.227l-.002-.005L6.382 17.637c-.092-.273-.328-.474-.636-.523l-.124-.011h-.001v-.001h-.666C3.879 17.101 2.976 16.781 2.366 16.063c-.581-.684-.751-1.562-.763-2.37C1.58 12.103 2.175 10.159 2.625 8.688 3.024 7.382 3.547 5.988 4.264 4.904 4.974 3.833 6.02 2.855 7.497 2.854h6.908l.225 .009ZM18.837 8.899h-2.678l-.097 .01c-.229 .044-.469 .232-.561 .577-.371 1.395-.981 3.667-1.549 5.755l-.014 .052-.02 .049c-.397 1.018-1.353 1.761-2.493 1.761h-3.115l.497 1.476c.115 .335 .43 .56 .783 .56h.001l6.91 .007c.482-0 1.002-.302 1.565-1.152 .555-.838 1.011-2.008 1.395-3.264 .478-1.564 .953-3.181 .936-4.393-.008-.592-.136-.926-.286-1.103-.122-.143-.385-.334-1.065-.334h-.212v.001ZM7.497 4.854C7.015 4.855 6.495 5.158 5.932 6.008 5.377 6.846 4.921 8.015 4.537 9.271c-.478 1.564-.952 3.181-.935 4.393 .009 .593 .137 .926 .288 1.104 .122 .144 .385 .334 1.064 .334h.677c.007 0 .013 .001 .02 .001h2.191c.253-.003 .552-.194 .657-.588 .371-1.395 .981-3.667 1.549-5.755l.014-.051 .02-.05c.397-1.018 1.353-1.76 2.493-1.76h3.12L15.187 5.414c-.115-.335-.429-.559-.782-.56h-6.908ZM12.575 8.899c-.226 0-.483 .146-.616 .455-.561 2.065-1.16 4.299-1.526 5.675-.007 .025-.015 .049-.023 .073h1.017c.226-0 .482-.148 .615-.457 .561-2.064 1.16-4.297 1.526-5.673 .007-.024 .015-.049 .023-.073h-1.016Z"),
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
        return _microsoftCopilotLine!!
    }

private var _microsoftCopilotLine: ImageVector? = null
